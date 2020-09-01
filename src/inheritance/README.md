# Inheritance in Object-Oriented Programming

## Types of Inheritance

### Simple Inheritance.  
- It typically includes a single parent class (superclass)
and a single child class (subclass).
- The emphasis is on the number of parent classes, i.e there should be only one parent class.

### Hierarchical Inheritance (Hie-rar-chi-cal -> 4 syllables)
- When there are more than 1 child classes, but only a single parent class.


### Multi-level Inheritance.
- It typically includes a set of  
 a grand parent class (superclass of the superclass)  
 a parent class (the superclass)  
 a child class (the subclass)

### Multiple Inheritance.
- It is not allowed in Java.
We inherit properties from more than one parent class.

### Hybrid Inheritance.
Requires an Abstract Class or an Interface.
 
## Types of Polymorphism

### Method Overloading
- Changing the behaviour of methods on the basis of inputs.
- It can be done either via changing the number of parameters of a method or changing the type of the parameters.

### Method Overriding
- Changing the behaviour of a method on the basis of the objects.
- The signature of the method that you want to override, should be exactly same!

## Use of Visibility Modifiers with Classes & Methods while using Inheritance
1. public : class/method can be accessed anywhere in the project! 
2. private : only inner classes can be private in Java, but they cannot be accessed
outside the class they are declared in.
3. protected : only inner members of a class can be protected, they can only be accessed
by their child classes, even outside the package it is declared in.
4. <default>. : can only be accessed inside the same package.
It acts as a private member for the package, hence it is sometimes also called
`package-private` (=default).

## Binding
It is the associating of a method call to a method body, done by the compiler.

### Static Binding
When the binding is performed by the compiler, at the compile-time, it is known as
`static binding` or `early binding`.

### Dynamic Binding
Here, the compiler is not able to resolve a method call by itself at the compile-time.
It is also known as `late-binding`.
Ex - Method Overriding.