def buildapp(){
    echo "Building branch ${params.BRANCH_VERSION}..."
    // Add your build steps here
}

def testapp(){
    echo "Testing branch ${params.BRANCH_VERSION}..."
    // Add your test steps here
}


def deployapp(){
    echo "Deploying branch ${params.BRANCH_VERSION}..."
    // Add your deploy steps here
}


return this