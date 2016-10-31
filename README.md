# Anonos® BigPrivacy® Policy Starter Project

You may base new Privacy Policies on this project.  See the
`src/main/java/com/anonos/bigprivacy/starter/StarterPolicy.java` file
to get started.

## Implementing a new policy

As-is, the `StarterPolicy` is not a valid policy.  You must change its
name and edit it according to the `TODO` messages in the file.  Note
that Pentaho Data Integration requires Java code to be compliant with
the Java 7 specification.  You may not use
[Java 8 features](http://www.oracle.com/technetwork/java/javase/8-whats-new-2157071.html),
like lambda functions and streams, in your policy code.

## Build and distribution

Please ensure you have [Apache Maven](https://maven.apache.org/) and
[JDK 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html)
installed on your computer before attempting any of the following.

To build this project, run `mvn clean install` from this directory
(i.e., the directory where `pom.xml` resides).

If you see the message `BUILD SUCCESS`, then your starter policies
will have been installed to the
`.m2/repository/com/anonos/bigprivacy/privacy-policies-starter/0.0.1-SNAPSHOT/`
directory under your home directory.  To make the Anonos BigPrivacy
software aware of these new policies, you must copy or link the
`privacy-policies-starter-0.0.1-SNAPSHOT.jar` file into the `privacy-policies`
directory inside your user account's Anonos directory.

We recommend linking the privacy policies `.jar` file, instead of
copying it, to make the development-test cycle smoother.

On Mac OS and Linux, a link is created with the following command in
a terminal.  You only need to do this once, when you first start
working on policies.

`ln -s ~/.m2/repository/com/anonos/bigprivacy/privacy-policies-starter/0.0.1-SNAPSHOT/privacy-policies-starter-0.0.1-SNAPSHOT.jar ~/Anonos/privacy-policies/`

Remember: after building your policies, you must restart Pentaho
Data Integration before the new policies will be used.

## Tools

We recommend [IntelliJ IDEA](https://www.jetbrains.com/idea/) as our
Java development environment of choice.  Their community edition is
sufficient for creating new policies.  Simply tell IDEA to load the
`pom.xml` file in this project, and IDEA will load the project.

Alternatively, command-line tools and non-IDE text editors will work
with this project equally well.
