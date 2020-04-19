job('NodeJS example') {
    scm {
        git('git://github.com/wilhelmpaulm/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('wilhelm martinez')
            node / gitConfigEmail('wilhempaulm@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
