@file:Suppress("ktlint")
package gg.jte.generated.ondemand
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JtetodoGenerated {
companion object {
	@JvmField val JTE_NAME = "todo.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,0,0,0,0,2,2,2,2,2,2,2,2)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, vararg tasks:String) {
		jteOutput.writeContent(" <h3>Tasks for today:</h3>\r\n")
		for (task in tasks) {
			jteOutput.writeContent("<p style=\"font-size: 18px\">")
			jteOutput.setContext("p", null)
			jteOutput.writeUserContent(task)
			jteOutput.writeContent("</p>")
		}
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
}
