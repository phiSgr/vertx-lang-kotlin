package io.vertx.kotlin.ext.auth

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.AuthProvider
import io.vertx.ext.auth.User
import io.vertx.kotlin.coroutines.awaitResult

suspend fun AuthProvider.authenticate(authInfo: JsonObject): User = awaitResult { this.authenticate(authInfo, it) }
