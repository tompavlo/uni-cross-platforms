@file:Suppress("ktlint")
package gg.jte.generated.precompiled
import gg.jte.Content
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JtefooterGenerated {
companion object {
	@JvmField val JTE_NAME = "footer.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,2,2,2,2,2,2,2,2,5,5,5,5,8,8,8,2,2,2,2,2)
	@JvmStatic val BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JtefooterGenerated::class.java, "JtefooterGenerated.bin", 55,12);
	@JvmStatic val TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0)
	@JvmStatic val TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, footer:Content) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0)
		jteOutput.setContext("div", null)
		jteOutput.writeUserContent(footer)
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_1)
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val footer = params["footer"] as Content
		render(jteOutput, jteHtmlInterceptor, footer);
	}
}
}
