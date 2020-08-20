package io.github.dko1905.passwordManagerServer.domain

enum class AccountRole(val value: Int){
	USER(0),
	READONLY(1),
	ADMIN(2);

	companion object {
		fun fromInt(value: Int) = values().first { it.value == value }
	}
}