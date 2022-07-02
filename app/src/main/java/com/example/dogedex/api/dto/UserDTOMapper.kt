package com.example.dogedex.api.dto

import com.example.model.User

class UserDTOMapper {
    fun fromUserDTOToUserDomain(userDTO: UserDTO): User =
        User(userDTO.id, userDTO.email, userDTO.authenticationToken)


}