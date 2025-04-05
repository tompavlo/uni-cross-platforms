@file:Suppress("ktlint")
package gg.jte.generated.ondemand
import tompavlo.uni.scbam.Person
import java.time.LocalTime
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JteindexGenerated {
companion object {
	@JvmField val JTE_NAME = "index.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,1,2,2,2,2,2,14,14,14,16,16,16,16,16,16,16,16,16,16,16,16,16,16,17,17,18,18,19,19,20,20,21,21,22,22,22,23,24,24,24,24,25,25,26,26,27,27,27,27,27,27,29)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, person:Person, time:LocalTime) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\"\r\n          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n    <title>Document</title>\r\n</head>\r\n")
		val time:LocalTime = LocalTime.now() 
		jteOutput.writeContent("\r\n<body>\r\n<p style=\"text-align: center\">")
		if (time.hour<10) {
			jteOutput.writeContent("0")
		}
		jteOutput.writeContent(" ")
		jteOutput.setContext("p", null)
		jteOutput.writeUserContent(time.hour)
		jteOutput.writeContent(" :")
		if (time.minute<10) {
			jteOutput.writeContent("0 ")
		}
		jteOutput.writeContent(" ")
		jteOutput.setContext("p", null)
		jteOutput.writeUserContent(time.minute)
		jteOutput.writeContent("</p>\r\n<h2>")
		if (time.hour in 11..17) {
			jteOutput.writeContent("Good day,\r\n    ")
		} else if (time.hour in 18..20) {
			jteOutput.writeContent("Good evening,\r\n    ")
		} else if (time.hour in 6..10) {
			jteOutput.writeContent(" Good morning\r\n    ")
		} else {
			jteOutput.writeContent(" Goodnight,\r\n    ")
		}
		jteOutput.writeContent("\r\n    ")
		jteOutput.setContext("h2", null)
		jteOutput.writeUserContent(person.name)
		jteOutput.writeContent("!</h2>\r\n")
		jteOutput.writeContent("\r\n")
		for (i in 1..3) {
			jteOutput.writeContent("<p style=\"font-size: 20px\">Remember, do what you supposed to do!</p>")
		}
		jteOutput.writeContent("\r\n")
		gg.jte.generated.ondemand.JteaskGenerated.render(jteOutput, jteHtmlInterceptor, true);
		jteOutput.writeContent("\r\n")
		gg.jte.generated.ondemand.JtetodoGenerated.render(jteOutput, jteHtmlInterceptor, "Blind typing practice 30 min", "English course");
		jteOutput.writeContent("\r\n")
		gg.jte.generated.ondemand.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor, object : gg.jte.html.HtmlContent {
			override fun writeTo(jteOutput:gg.jte.html.HtmlTemplateOutput) {
				jteOutput.writeContent(" <h3><br> Have a productive day! </h3>")
			}
		});
		jteOutput.writeContent("\r\n</body>\r\n</html>")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val person = params["person"] as Person
		val time = params["time"] as LocalTime
		render(jteOutput, jteHtmlInterceptor, person, time);
	}
}
}
