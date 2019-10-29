properties([[$class: 'JiraProjectProperty'], parameters([string(defaultValue: 'Tal', description: '', name: 'name', trim: false)]), pipelineTriggers([pollSCM('*/2 * * * *')])])
node {
    stage("checkout repo"){
        git branch: 'develop', url: 'https://github.com/tallevi1000/work-with-github.git' 
    }
    stage("hello world"){
        echo "hello world"
    }
}
