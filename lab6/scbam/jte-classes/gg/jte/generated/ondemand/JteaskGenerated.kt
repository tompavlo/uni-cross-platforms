@file:Suppress("ktlint")
package gg.jte.generated.ondemand
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JteaskGenerated {
companion object {
	@JvmField val JTE_NAME = "ask.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,0,0,0,0,2,2,2,2,2)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, goodMood:Boolean) {
		jteOutput.writeContent("\r\n")
		if (goodMood) {
			jteOutput.writeContent("<h3>Hope you're doing fine!</h3>")
		}
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val goodMood = params["goodMood"] as Boolean? ?: true
		render(jteOutput, jteHtmlInterceptor, goodMood);
	}
}
}
