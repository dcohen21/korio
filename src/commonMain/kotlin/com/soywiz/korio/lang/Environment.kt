package com.soywiz.korio.lang

import com.soywiz.korio.*

expect object Environment {
	// Uses querystring on JS/Browser, and proper env vars in the rest
	operator fun get(key: String): String?
}
