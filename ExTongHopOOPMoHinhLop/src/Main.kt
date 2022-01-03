fun main(args: Array<String>) {
    var dsStaff:StaffList = StaffList()
    var teo =Executive()
    var ty = Hourly()
    var tun = Volunteer()
    dsStaff.addStaff(teo)
    dsStaff.addStaff(ty)
    dsStaff.addStaff(tun)

    dsStaff.payDay()
}