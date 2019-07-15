
#Overview:

	This documentation provides an overview of how the ARROW operator is used in JavaScript for functional 
	programming and the pros and cons of using it. 

#Arrow Operator:
Arrow operators are syntaxes for writing function expressions. 
It uses the  => token.   It reduces the function code size without its own bindings like the 
*this, argument, super or new.target * keywords.

Pros:
•	Reduce Code Size
•	No need to define a Return statement for one line functions
•	Lexically bind the context
Cons:
•	The Objects cannot be constructors
•	They don’t bind an arguments object.

#Test Samples:

•	<script> 
  		  setDoubleSize = (sz)=>size=2*sz; 
   		 setDoubleSize(35); 
   		 document.write(size);     
      
</script> 	

•	var materials = [ 'Hydrogen',  'Helium',  'Lithium', 'Beryllium'];

console.log(materials.map(material => material.length));

#Conclusion:

		The Arrow operator work well with callback functions, but doesn’t work with object
		methods and constructors. 

Hannah Mao
Joseph Chacko
07-15-2019
