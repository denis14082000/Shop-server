package org.dkazantsev.shopPractice.user.exceptions

import java.util.UUID

class UserNotFoundException(login: String) : Exception("User with login=$login not found") //TODO(ADD EXCEPTION HANDLER)