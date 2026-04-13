package ca.hccis

import bo.BusPassBO
import entity.BusPass
import utility.CisUtility
import kotlin.collections.ArrayList

var busPasses:ArrayList<BusPass> = ArrayList()

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Bus Pass"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Welcome to the  $name application!\n")

    val MENU: String = "\nMain Menu\nA-Add a Bus Pass\nB-Show all Bus Passes\nX-eXit"
    var option: String = ""
    do {
        option = CisUtility.getInputString(MENU)
        when (option.uppercase()) {
            "A" -> add()
            "B" -> show()
            "X" -> println("Goodbye")
            else -> println("Invalid")
        }
    } while (!option.equals("X", ignoreCase = true))

}

fun add(): BusPass {
    println("\nAdd a bus pass")
    val bussPass: BusPass = BusPass();
    bussPass.getInformation()
    BusPassBO.calculateBusPassCost(bussPass)
    println("")
    println(bussPass.toString())
    println("")
    busPasses.add(bussPass)
    return bussPass
}

fun show(): Unit {
    println("\nHere are the bus passes:")
    for(busPass in busPasses){
        println(busPass)
    }
}