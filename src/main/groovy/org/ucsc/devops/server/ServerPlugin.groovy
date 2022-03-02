package org.ucsc.devops.server

import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.GradleException

/**
 * server plugin.
 *
 * @author Pra
 * @since 1.03.2022
 */
@CompileStatic
class ServerPlugin implements Plugin<Project> {

    @Override
    @CompileStatic(TypeCheckingMode.SKIP)
    void apply(Project project) {
        ServerExtension extension = project.extensions.create('server', ServerExtension)

        project.afterEvaluate {
            if (extension.bar == null) {
                throw new GradleException('server.bar configuration required')
            }
        }
    }
}
