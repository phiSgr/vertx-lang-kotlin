package io.vertx.kotlin.ext.web.templ

import io.vertx.core.buffer.Buffer
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.templ.TemplateEngine
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Deprecated
import kotlin.String

@Deprecated("")
suspend fun TemplateEngine.render(context: RoutingContext, templateFileName: String): Buffer = awaitResult { this.render(context, templateFileName, it) }

suspend fun TemplateEngine.render(
    context: RoutingContext,
    templateDirectory: String,
    templateFileName: String
): Buffer = awaitResult { this.render(context, templateDirectory, templateFileName, it) }
