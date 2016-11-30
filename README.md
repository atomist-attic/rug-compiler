# Atomist 'rug-compiler'

[![Build Status](https://travis-ci.org/atomist/rug-compiler.svg?branch=master)](https://travis-ci.org/atomist/rug-compiler)
[![Slack Status](https://join.atomist.com/badge.svg)](https://join.atomist.com/)

Atomist Rug compiler interface.

## Use

If you are creating and running Rugs, you likely do not need to use
this project directly.  It is only useful to those implementing new
Rug compilers.  See [rug-typescript-compiler][ts] for an example
implementation.

[ts]: https://github.com/atomist/rug-typescript-compiler

If you wish to develop a Rug compiler, you will need to add this
project as a dependency and the maven repository where it is published
to your build tool's configuration.  For example, if you use maven,
add the dependency to the `<dependencies>` section and the repository
to the `<repositories>` section of your `pom.xml`:

```xml
<?xml version='1.0' encoding='UTF-8'?>
<project
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://maven.apache.org/POM/4.0.0">
	<modelVersion>4.0.0</modelVersion>
    ...
    <dependencies>
        ...
		<dependency>
			<groupId>com.atomist</groupId>
			<artifactId>rug-compiler</artifactId>
			<version>0.1.0</version>
		</dependency>
        ...
	</dependencies>
    ...
	<repositories>
		<repository>
			<id>public-atomist-release</id>
			<name>Atomist Release</name>
			<url>https://atomist.jfrog.io/atomist/libs-release</url>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</repository>
	</repositories>
    ...
</project>
```

Be sure to change the `<version>` to the one you want to use.

## Support

General support questions should be discussed in the `#support`
channel on our community slack team
at [atomist-community.slack.com](https://join.atomist.com).

If you find a problem, please create an [issue][].

[issue]: https://github.com/atomist/rug-compiler/issues

## Developing

You can build, test, and install the project locally with [maven][].

[maven]: https://maven.apache.org/

```sh
$ mvn install
```

To create a new release of the project, simply push a tag of the form
`M.N.P` where `M`, `N`, and `P` are integers that form the next
appropriate [semantic version][semver] for release.  For example:

```sh
$ git tag -a 1.2.3
```

The Travis CI build (see badge at the top of this page) will
automatically create a GitHub release using the tag name for the
release and the comment provided on the annotated tag as the contents
of the release notes.  It will also automatically upload the needed
artifacts.

[semver]: http://semver.org
