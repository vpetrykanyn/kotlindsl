package Kotlindsl.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object Kotlindsl_Build : BuildType({
    uuid = "654868e0-2db3-4033-b826-edcbad8ed040"
    id = "Kotlindsl_Build"
    name = "Build"

    vcs {
        root(Kotlindsl.vcsRoots.Kotlindsl_HttpsGithubComVpetrykanynKotlindslGitRefsHeadsMaster)

    }

    steps {
        script {
            scriptContent = "echo KUKU"
        }
        script {
            scriptContent = "echo KUKU2"
        }
    }

    triggers {
        vcs {
        }
    }
})
