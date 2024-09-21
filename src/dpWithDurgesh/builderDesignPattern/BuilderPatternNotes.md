-----------------BUILDER DESIGN PATTERN------------------- 

WHILE creating object when object contains many attributes there are many problem exists:

	1. we have to pass many arguments to create object >> order of passing??
	2. some parameter might be options >> multiple constructor without optional parameter
	3. factory class takes all responsibility for creating object. If the object is heavy then all complexity is the part of factory class

So in builder pattern, we create object step by step and finally return final object with desired values of attributes

Mostly used to create immutable objects

