@file:Suppress("ktlint")
package gg.jte.generated.precompiled
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JtetodoGenerated {
companion object {
	@JvmField val JTE_NAME = "todo.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2)
	@JvmStatic val BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JtetodoGenerated::class.java, "JtetodoGenerated.bin", 28,27,4);
	@JvmStatic val TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0)
	@JvmStatic val TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1)
	@JvmStatic val TEXT_PART_BINARY_2 = BINARY_CONTENT.get(2)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, vararg tasks:String) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0)
		for (task in tasks) {
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_1)
			jteOutput.setContext("p", null)
			jteOutput.writeUserContent(task)
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_2)
		}
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
}
