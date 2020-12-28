/*
Learning java
author @bryant_kobe
19th Dec,2020
*/

package com.company;

public class HelloWorld {

    public static void main(String[] args) {      // main function and void -- so the function does not return anything and static -- without making object run the program
        System.out.println("Hello World");

    }
}
/*
---------------------Notes:-----------------------------------
19th Dec,2020

PascalConvention -- class
camelCaseConvention -- function

# Anatomy of Java
Documentation Section
Package Statement
Import Statements
Interface Statements
class definitions
main method
{
main method definition
}

# Data Types in Java

--Primitive Data types --> int , long, float , double, long, char, bool, string
--Non- Primitive Data types --> derived from primitive data types

#Variables
--Naming conventions for variables
>must not begin with a digit
>Name is case-sensitive that is, Name and name are different variables.
> With spaces not allowed.
>can contain alphabets, $ characters, _character and digits if the other conditions stated above are met.
If the above rules are not followed, then the error that we get is **"java : not a statement"**
int number = 8 ie, datatype var_name = 8

Is the language compiled or interpreted?
--Source code-->compiled-->byte code-->interpreted-->Machine code

Why the java is statically typed language?
--because we need to declare the type of var whenever we declare the variable.

--Reserved keywords- static, void

# Literals
for info. check literals.java program.

#Keywords (48)
abstract	continue	 for	       new	              switch
assert***	default	     goto*	       package	          synchronized
boolean	    do	          if	       private	           this
break	    double	    implements	    protected	       throw
byte	    else	    import	public	throws             while
case	    enum****	instanceof	    return	           transient
catch	    extends	    int	short	    try                void
char	    final	    interface	    static	           volatile
class	    finally	    long	        strictfp**
const*	    float	    native	        super
-->keywords will be highlighted while used in IDE.
* not used
** added in 1.2
*** added in 1.4
**** added in 5.0

20th Dec,2020

**To take input from user
using scanner class refer Takinginput.java

**for rounding and typecasting refer the respective programs.S

**some practise set problems are also solved here

# Operators
Arithmetic Operators ->+, -, *, /, %,++,--
Assignment Operators->=,+=
Comparison Operators->==, > = ,< =
Logical Operators-->&&, || , !
Bitwise Operators-->&, |

** for precedence and associativity please refer the pgm preassoc.java.

NOTE:PLEASE REFER TO chap2prac2.java.

21st Dec,2020
Strings are actually classes in java but they have special support in java so they are used as primitive data types.
--are immutable
**SYNTAX
-- String variable = new String("Write what you want to put into variable");
 --------------------------------OR-----------------------------------------
--String variable = "Write what you want to put into variable";
*/
