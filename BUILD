load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "java-maven-lib",
    srcs = glob(["src/main/java/com/bakuyuu/**/*.java"]),
    deps = ["@maven//:org_springframework_boot_spring_boot_starter_web",
           "@maven//:org_springframework_boot_spring_boot",
           "@maven//:org_springframework_boot_spring_boot_autoconfigure",
           "@maven//:org_springframework_spring_beans",
           "@maven//:org_springframework_spring_web",
           "@maven//:org_springframework_spring_context"
            ],
)

java_binary(
    name = "java-maven",
    main_class = "com.bakuyuu.JavaSpringbootBazelDemoApplication",
    runtime_deps = [":java-maven-lib"],
)