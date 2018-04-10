println "#" * 50
println "Loaded runtime.groovy"
println ""
try {
    final holdersAvailable = grails.util.Holders.getGrailsApplication()
} catch (Exception e) {
    println "Grails Application not available"
}
println "#" * 50

//println "=" * 15 + '  System Properties  ' + "=" * 15
//println System.getProperty("testProperty")

//println "=" * 14 + ' Environment Variables ' + "=" * 14
//println System.getenv("THE_QUESTION")

the {
    computation {
        timeframe = System.getenv("THE_TIME")
    }
}