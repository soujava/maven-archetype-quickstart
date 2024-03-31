file = new File( request.getOutputDirectory(), request.getArtifactId()+"/_gitignore_" );
def gitIgnorefile = new File( request.getOutputDirectory(), request.getArtifactId()+"/.gitignore" );
file.renameTo(gitIgnorefile)