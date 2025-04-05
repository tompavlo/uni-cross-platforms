@file:Suppress("ktlint")
package gg.jte.generated.ondemand
import gg.jte.Content
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JtefooterGenerated {
companion object {
	@JvmField val JTE_NAME = "footer.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,2,2,2,2,2,5,5,5,5,8)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, footer:Content) {
		jteOutput.writeContent("\r\n<div class=\"footer\" style=\"text-align: center\">\r\n    ")
		jteOutput.setContext("div", null)
		jteOutput.writeUserContent(footer)
		jteOutput.writeContent("\r\n</div>\r\n\r\n")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val footer = params["footer"] as Content
		render(jteOutput, jteHtmlInterceptor, footer);
	}
}
}
