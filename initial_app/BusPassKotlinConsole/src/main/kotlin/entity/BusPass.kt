package entity

import utility.CisUtility
import java.math.BigDecimal

class BusPass {
    var id: Int? = 0
    var name: String?
    var address: String? = ""
    var city: String? = ""
    var preferredRoute: String? = ""
    var passType: Int? = 1
    var validForRuralRoute: Boolean = false
    var lengthOfPass: Int? = 0
    var startDate: String? = ""
    var cost: BigDecimal? = null

    init {
        name = "Unknown"
    }

    fun  getInformation(){
        name = CisUtility.getInputString("Name")
        address = CisUtility.getInputString("Address")
        city = CisUtility.getInputString("City");
        preferredRoute = CisUtility.getInputString("Preferred route");
        passType = CisUtility.getInputInt("Pass type (3-Regular, 4-K12, 5-Student, 6-Senior")
        validForRuralRoute = CisUtility.getInputBoolean("Rural route")
        lengthOfPass = CisUtility.getInputInt("Length of pass in days");
        startDate = CisUtility.getInputString("Start date (yyyy-MM-dd)")
    }

    override fun toString(): String {

        return "\nBusPass($id)\n" +
                "Name=$name\n" +
                "Address=$address\n" +
                "City=$city\n" +
                "Preferred Route=$preferredRoute\nPass Type=$passType\n" +
                "Valid For Rural Route=$validForRuralRoute\nLength Of Pass=$lengthOfPass\n" +
                "Start Date=$startDate\nCost="+CisUtility.toCurrency(cost?.toDouble())
    }

}