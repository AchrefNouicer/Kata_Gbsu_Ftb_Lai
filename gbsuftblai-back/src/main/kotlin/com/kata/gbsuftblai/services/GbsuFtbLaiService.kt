package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    companion object {
        const val GBSU = "Gbsu"
        const val FTB = "Ftb"
        const val LAI = "Lai"
    }

    fun convertNumber(inputNumber: Int): String {
        if (inputNumber == 0)
            return inputNumber.toString();
        var result = "";

        if (inputNumber % 3 == 0)
            result = result.plus(GBSU)
        if (inputNumber % 5 == 0)
            result = result.plus(FTB)

        for (c in inputNumber.toString()) {
            when (c) {
                '3' -> result = result.plus(GBSU)
                '5' -> result = result.plus(FTB)
                '7' -> result = result.plus(LAI)
            }
        }

        return if (result.isEmpty())
            inputNumber.toString()
        else result;
    }

}
