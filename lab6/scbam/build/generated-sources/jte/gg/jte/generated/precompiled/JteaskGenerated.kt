@file:Suppress("ktlint")
package gg.jte.generated.precompiled
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JteaskGenerated {
companion object {
	@JvmField val JTE_NAME = "ask.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0)
	@JvmStatic val BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteaskGenerated::class.java, "JteaskGenerated.bin", 2,32);
	@JvmStatic val TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0)
	@JvmStatic val TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, goodMood:Boolean = true) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0)
		if (goodMood) {
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_1)
		}
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val goodMood = params["goodMood"] as Boolean? ?: true
		render(jteOutput, jteHtmlInterceptor, goodMood);
	}
}
}
