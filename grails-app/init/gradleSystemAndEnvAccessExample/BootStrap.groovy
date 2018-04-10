package gradleSystemAndEnvAccessExample

import grails.core.GrailsApplication
import grails.util.Holders

class BootStrap {

    GrailsApplication grailsApplication

    def init = { servletContext ->
        // retrieve the the.ultimate.answer config value
        final theUltimateQuestion =  grailsApplication.config.getProperty('the.ultimate.question')
        final theUltimateAnswer = grailsApplication.config.getProperty('the.ultimate.answer')
        final howLongDidItTake = grailsApplication.config.getProperty('deepthought.question')
        final timeframe = grailsApplication.config.getProperty('the.computation.timeframe')
        println "${theUltimateQuestion}: ${theUltimateAnswer}"
        println "${howLongDidItTake}: ${timeframe} years"
        final holdersAvailable = Holders.getGrailsApplication() ? true : false
        println "Holders Available? ${holdersAvailable}"
    }
    def destroy = {
    }
}
