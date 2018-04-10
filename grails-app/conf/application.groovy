println "*" * 50
println "Loaded application.groovy"
println ""
try {
    final holdersAvailable = grails.util.Holders.getGrailsApplication()
} catch (Exception e) {
    println "Grails Application not available"
}
println "*" * 50

//println "=" * 15 + '  System Properties  ' + "=" * 15
//println System.getProperty("testProperty")

deepthought {
    question = System.getProperty("testProperty")
}

the {
    ultimate {
        question = System.getenv("THE_QUESTION")
    }
}