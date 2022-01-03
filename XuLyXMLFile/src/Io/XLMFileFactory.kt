package Io

import Model.SanPham
import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

class XLMFileFactory {
    public fun LuuDuLieu(dsSp:MutableList<SanPham>,path:String):Boolean{
        try {
            var docFactory:DocumentBuilderFactory = DocumentBuilderFactory.newInstance()
            var docBuilder:DocumentBuilder = docFactory.newDocumentBuilder()
            var doc:Document = docBuilder.newDocument()
            var rootElement:Element = doc.createElement("SanPhams")
            doc.appendChild(rootElement)
            for ( sp in dsSp){
                var spElement = doc.createElement("SanPham")
                var maElement = doc.createElement("Ma")
                maElement.textContent = sp.ma.toString()
                var tenElement = doc.createElement("Ten")
                tenElement.textContent = sp.ten
                var giaElement = doc.createElement("Gia")
                giaElement.textContent = sp.gia.toString()

                 spElement.appendChild(maElement)
                 spElement.appendChild(tenElement)
                 spElement.appendChild(giaElement)

                rootElement.appendChild(spElement)
            }
            var tranformFactory:TransformerFactory =TransformerFactory.newInstance()
            var tranform:Transformer = tranformFactory.newTransformer()
            var source:DOMSource = DOMSource(doc)
            var result:StreamResult = StreamResult(File(path).absolutePath)
            tranform.transform(source,result)
            return true
        } catch (ex:Exception){
            ex.printStackTrace()
        }
        return false
    }
    public fun docDuLieu(path: String):MutableList<SanPham>
    {
        var dsSp:MutableList<SanPham> = mutableListOf()
        try {
            var docBuilderFactory = DocumentBuilderFactory.newInstance()
            var docBuilder = docBuilderFactory.newDocumentBuilder()
            var xmlFile= File(path)
            var doc = docBuilder.parse(xmlFile)
            var nodeList= doc.documentElement.childNodes
            for ( i in 0 until nodeList.length){
                var node = nodeList.item(i)
                if(node is Element){
                    var sp=SanPham()
                    var childNodes = node.childNodes
                    for (j in 0 until childNodes.length){
                        var childNode = childNodes.item(j)
                        if(childNode is Element){
                            val content = childNode.lastChild.textContent
                            when ((childNode.nodeName)){
                                "Ma"->sp.ma = content.toInt()
                                "Ten"->sp.ten = content
                                "Gia"->sp.gia = content.toDouble()
                            }
                        }
                    }
                    dsSp.add(sp)
                }
            }
        } catch (ex:Exception) {
            ex.printStackTrace()
        }
        return dsSp
    }
}