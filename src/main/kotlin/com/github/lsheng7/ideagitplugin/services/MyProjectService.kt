package com.github.lsheng7.ideagitplugin.services

import com.intellij.openapi.project.Project
import com.github.lsheng7.ideagitplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
