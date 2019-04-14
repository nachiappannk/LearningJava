# Lombok
Lombok is a tool that is used to reduce the boiler plate code. 

It's interesting to know the reason for it's name. Lombok is also an island in Indonesia just like Java
It also means chilli. It's tag line says Spicing up Java

Lombok is an annotation processor. To get Lombok to work we need to enable Lombok in the IDE.
The dependency has be enabled in gradle

The steps to get Lombok working in IntelliJ, the following has to be done.
1. Lombok plugin has to installed in IntelliJ IDE (This needs restart of IntelliJ)
2. Annotation Processing has to be enabled in IntelliJ 

### Getting Started with Lombok in a gradle project in IntelliJ
1. Install Lombok plugin in IntelliJ (IntelliJ restart is needed)
2. Enable Annotation Processing in IntelliJ
3. Add the dependency of Lombok to gradle.builder
4. Now Lombok can be used
The details could be seen [here](https://github.com/nachiappannk/LearningJava/compare/preparing-for-lombok...implementing-lombok)

### @Getter
Adds getter for a field.
Explained in the default example [here](https://github.com/nachiappannk/LearningJava/compare/preparing-for-lombok...implementing-lombok)

### @Setter
Adds setter.
Similar to getter.

### @ToString
Overrides the toString method
Explained in the default example [here](https://github.com/nachiappannk/LearningJava/compare/preparing-for-lombok...implementing-lombok)

### @EqualsAndHashCode
Overrides the toString method and hash code method

### @Builder
Creates a builder pattern for building the object. To use the builder pattern we need to annotate the class with AllArgsConstructor also
The details can be seen [here](https://github.com/nachiappannk/LearningJava/compare/implementing-lombok...Implementing-lombok-builder)

### @Slf4j
Slf4j is a loggin framework.
Lombok introduces a mechanism to log using Slf4j.
The details of it can be found [here](https://github.com/nachiappannk/LearningJava/compare/implementing-lombok...Implementing-logging-using-slf4j)

### @Log

### @SneakyThrows

### @NonNull

### @Data

### @Value

### @NoArgsConstructor

### @AllArgsConstructor

[Home](ReadMe.md)
