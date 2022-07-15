package com.example.dogedex.api.dto

import com.example.model.Dog

class DogDTOMapper {

     fun fromDogDTOToDogDomain(DogDTO: DogDTO): Dog {
        return Dog(
            DogDTO.id,
            DogDTO.index,
            DogDTO.name,
            DogDTO.type,
            DogDTO.heightFemale,
            DogDTO.heightMale,
            DogDTO.imageUrl,
            DogDTO.lifeExpectancy,
            DogDTO.temperament,
            DogDTO.weightFemale,
            DogDTO.weightMale,
        )
    }

    fun fromDogDTOListToDogDomainList(dogDtoList: List<DogDTO>): List<Dog>{
        return dogDtoList.map { fromDogDTOToDogDomain(it) }

    }
}