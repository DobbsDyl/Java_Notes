/*
JDK (Java Development Kit):     complete package for Java development (includes JRE and java compiliers - javac)
JRE (Java Runtime Environment): For running Java applications (includes JVM and libraries).
JVM (Java Virtual Machine):     Runs Java bytecode (compiled Java code, interpreter betwenn bytecode and the machine).

**JVM allows for the "write once, run anywhere" principle**

Just-In-Time (JIT) Compilier
- Part of JVM
- translates bytecode into machinecode at runtime

JIT vs JVM
- JVM interprets bytecode
- JIT optimizes performance (compiles "hot spots" frequently executed code directly to machine)

Bytecode vs Machine Code
- Bytecode: when java code is compiled by JDK's compilier (javac) it becomes bytecode (platform independent code, portbale across systems)
- Machine Code: native binary code that the hardware (CPU) understands and executes

- Byte code is converted into machine code by the JVM at runtime through the JIT Compilier
 */