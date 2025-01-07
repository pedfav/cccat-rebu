package br.com.pedfav.cccat_rebu.domain.usecase

class ValidateCarPlateUseCase {

    fun isCarPlateValid(carPlate: String): Boolean {
        if (carPlate.isBlank()) return false
        if (!carPlateHasValidLength(carPlate)) return false
        return carPlateMatchesPattern(carPlate)
    }

    private fun carPlateHasValidLength(carPlate: String): Boolean =
            carPlate.length == CAR_PLATE_LENGTH

    private fun carPlateMatchesPattern(carPlate: String): Boolean =
            carPlate.matches(Regex("[aA-zZ]{2,3}[0-9]{4}|[A-Z]{3,4}[0-9]{3}|[A-Z0-9]{7}"))

    companion object {
        const val CAR_PLATE_LENGTH = 7
    }
}