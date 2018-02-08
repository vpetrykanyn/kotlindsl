package Kotlindsl

import Kotlindsl.buildTypes.*
import Kotlindsl.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project

object Project : Project({
    uuid = "f05fe064-4ee9-4b93-8e5f-789437aeb79d"
    id = "Kotlindsl"
    parentId = "_Root"
    name = "Kotlindsl"

    vcsRoot(Kotlindsl_HttpsGithubComVpetrykanynKotlindslGitRefsHeadsMaster)

    buildType(Kotlindsl_Build)
})
