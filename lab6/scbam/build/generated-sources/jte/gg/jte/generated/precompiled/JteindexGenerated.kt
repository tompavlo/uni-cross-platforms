@file:Suppress("ktlint")
package gg.jte.generated.precompiled
import tompavlo.uni.scbam.Person
import java.time.LocalTime
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JteindexGenerated {
companion object {
	@JvmField val JTE_NAME = "index.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,14,14,14,16,16,16,16,16,16,16,16,16,16,16,16,16,16,17,17,18,18,19,19,20,20,21,21,22,22,22,23,24,24,24,24,25,25,26,26,27,27,27,27,27,27,29,29,29,2,3,3,3,3,3)
	@JvmStatic val BINARY_CONTENT = gg.jte.runtime.BinaryContent.load(JteindexGenerated::class.java, "JteindexGenerated.bin", 313,40,1,1,2,2,1,10,15,19,19,17,6,8,2,68,2,2,2,38,18);
	@JvmStatic val TEXT_PART_BINARY_0 = BINARY_CONTENT.get(0)
	@JvmStatic val TEXT_PART_BINARY_1 = BINARY_CONTENT.get(1)
	@JvmStatic val TEXT_PART_BINARY_2 = BINARY_CONTENT.get(2)
	@JvmStatic val TEXT_PART_BINARY_3 = BINARY_CONTENT.get(3)
	@JvmStatic val TEXT_PART_BINARY_4 = BINARY_CONTENT.get(4)
	@JvmStatic val TEXT_PART_BINARY_5 = BINARY_CONTENT.get(5)
	@JvmStatic val TEXT_PART_BINARY_6 = BINARY_CONTENT.get(6)
	@JvmStatic val TEXT_PART_BINARY_7 = BINARY_CONTENT.get(7)
	@JvmStatic val TEXT_PART_BINARY_8 = BINARY_CONTENT.get(8)
	@JvmStatic val TEXT_PART_BINARY_9 = BINARY_CONTENT.get(9)
	@JvmStatic val TEXT_PART_BINARY_10 = BINARY_CONTENT.get(10)
	@JvmStatic val TEXT_PART_BINARY_11 = BINARY_CONTENT.get(11)
	@JvmStatic val TEXT_PART_BINARY_12 = BINARY_CONTENT.get(12)
	@JvmStatic val TEXT_PART_BINARY_13 = BINARY_CONTENT.get(13)
	@JvmStatic val TEXT_PART_BINARY_14 = BINARY_CONTENT.get(14)
	@JvmStatic val TEXT_PART_BINARY_15 = BINARY_CONTENT.get(15)
	@JvmStatic val TEXT_PART_BINARY_16 = BINARY_CONTENT.get(16)
	@JvmStatic val TEXT_PART_BINARY_17 = BINARY_CONTENT.get(17)
	@JvmStatic val TEXT_PART_BINARY_18 = BINARY_CONTENT.get(18)
	@JvmStatic val TEXT_PART_BINARY_19 = BINARY_CONTENT.get(19)
	@JvmStatic val TEXT_PART_BINARY_20 = BINARY_CONTENT.get(20)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, person:Person, time:LocalTime) {
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_0)
		val time:LocalTime = LocalTime.now() 
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_1)
		if (time.hour<10) {
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_2)
		}
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_3)
		jteOutput.setContext("p", null)
		jteOutput.writeUserContent(time.hour)
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_4)
		if (time.minute<10) {
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_5)
		}
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_6)
		jteOutput.setContext("p", null)
		jteOutput.writeUserContent(time.minute)
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_7)
		if (time.hour in 11..17) {
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_8)
		} else if (time.hour in 18..20) {
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_9)
		} else if (time.hour in 6..10) {
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_10)
		} else {
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_11)
		}
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_12)
		jteOutput.setContext("h2", null)
		jteOutput.writeUserContent(person.name)
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_13)
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_14)
		for (i in 1..3) {
			jteOutput.writeBinaryContent(TEXT_PART_BINARY_15)
		}
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_16)
		gg.jte.generated.precompiled.JteaskGenerated.render(jteOutput, jteHtmlInterceptor, true);
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_17)
		gg.jte.generated.precompiled.JtetodoGenerated.render(jteOutput, jteHtmlInterceptor, "Blind typing practice 30 min", "English course");
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_18)
		gg.jte.generated.precompiled.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor, object : gg.jte.html.HtmlContent {
			override fun writeTo(jteOutput:gg.jte.html.HtmlTemplateOutput) {
				jteOutput.writeBinaryContent(TEXT_PART_BINARY_19)
			}
		});
		jteOutput.writeBinaryContent(TEXT_PART_BINARY_20)
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val person = params["person"] as Person
		val time = params["time"] as LocalTime
		render(jteOutput, jteHtmlInterceptor, person, time);
	}
}
}
