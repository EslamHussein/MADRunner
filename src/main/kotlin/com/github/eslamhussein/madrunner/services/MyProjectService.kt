package com.github.eslamhussein.madrunner.services

import com.intellij.openapi.project.Project
import com.github.eslamhussein.madrunner.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
