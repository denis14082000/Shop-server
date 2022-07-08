package org.dkazantsev.shopPractice.user.exceptions

class UserNotFoundException(login: String) : Exception("User with login=$login not found") //TODO(ADD EXCEPTION HANDLER)