<<<<<<< HEAD
#include <iostream> 
using namespace std; 

// Function to compare two strings 
// ignoring their cases 
bool equalIgnoreCase(string str1, string str2) 
{ 
	int i = 0; 

	// length of first string 
	int len1 = str1.size(); 

	// length of second string 
	int len2 = str2.size(); 

	// if length is not same 
	// simply return false since both string 
	// can not be same if length is not equal 
	if (len1 != len2) 
		return false; 

	// loop to match one by one 
	// all characters of both string 
	while (i < len1) { 

		// if current characters of both string are same, 
		// increase value of i to compare bnext character 
		if (str1[i] == str2[i]) { 
			i++; 
		} 

		// if any character of first strinf 
		// is some special character 
		// or numeric character and 
		// not same as corresponding character 
		// of second string then return false 
		else if (!((str1[i] >= 'a' && str1[i] <= 'z') 
				|| (str1[i] >= 'A' && str1[i] <= 'Z'))) { 
			return false; 
		} 

		// do the same for second string 
		else if (!((str2[i] >= 'a' && str2[i] <= 'z') 
				|| (str2[i] >= 'A' && str2[i] <= 'Z'))) { 
			return false; 
		} 

		// this block of code will be executed 
		// if characters of both strings 
		// are of different cases 
		else { 
			// compare characters by ASCII value 
			if (str1[i] >= 'a' && str1[i] <= 'z') { 
				if (str1[i] - 32 != str2[i]) 
					return false; 
			} 

			else if (str1[i] >= 'A' && str1[i] <= 'Z') { 
				if (str1[i] + 32 != str2[i]) 
					return false; 
			} 

			// if characters matched, 
			// increase the value of i to compare next char 
			i++; 

		} // end of outer else block 

	} // end of while loop 

	// if all characters of the first string 
	// are matched with corresponding 
	// characters of the second string, 
	// then return true 
	return true; 

} // end of equalIgnoreCase function 

// Function to print the same or not same 
// if strings are equal or not equal 
void equalIgnoreCaseUtil(string str1, string str2) 
{ 
	bool res = equalIgnoreCase(str1, str2); 

	if (res == true) 
		cout << "Same" << endl; 

	else
		cout << "Not Same" << endl; 
} 

// Driver Code 
int main() 
{ 
	string str1, str2; 

	str1 = "Geeks"; 
	str2 = "geeks"; 
	equalIgnoreCaseUtil(str1, str2); 

	str1 = "Geek"; 
	str2 = "geeksforgeeks"; 
	equalIgnoreCaseUtil(str1, str2); 
	return 0; 
} 
=======
#include <iostream> 
using namespace std; 

// Function to compare two strings 
// ignoring their cases 
bool equalIgnoreCase(string str1, string str2) 
{ 
	int i = 0; 

	// length of first string 
	int len1 = str1.size(); 

	// length of second string 
	int len2 = str2.size(); 

	// if length is not same 
	// simply return false since both string 
	// can not be same if length is not equal 
	if (len1 != len2) 
		return false; 

	// loop to match one by one 
	// all characters of both string 
	while (i < len1) { 

		// if current characters of both string are same, 
		// increase value of i to compare bnext character 
		if (str1[i] == str2[i]) { 
			i++; 
		} 

		// if any character of first strinf 
		// is some special character 
		// or numeric character and 
		// not same as corresponding character 
		// of second string then return false 
		else if (!((str1[i] >= 'a' && str1[i] <= 'z') 
				|| (str1[i] >= 'A' && str1[i] <= 'Z'))) { 
			return false; 
		} 

		// do the same for second string 
		else if (!((str2[i] >= 'a' && str2[i] <= 'z') 
				|| (str2[i] >= 'A' && str2[i] <= 'Z'))) { 
			return false; 
		} 

		// this block of code will be executed 
		// if characters of both strings 
		// are of different cases 
		else { 
			// compare characters by ASCII value 
			if (str1[i] >= 'a' && str1[i] <= 'z') { 
				if (str1[i] - 32 != str2[i]) 
					return false; 
			} 

			else if (str1[i] >= 'A' && str1[i] <= 'Z') { 
				if (str1[i] + 32 != str2[i]) 
					return false; 
			} 

			// if characters matched, 
			// increase the value of i to compare next char 
			i++; 

		} // end of outer else block 

	} // end of while loop 

	// if all characters of the first string 
	// are matched with corresponding 
	// characters of the second string, 
	// then return true 
	return true; 

} // end of equalIgnoreCase function 

// Function to print the same or not same 
// if strings are equal or not equal 
void equalIgnoreCaseUtil(string str1, string str2) 
{ 
	bool res = equalIgnoreCase(str1, str2); 

	if (res == true) 
		cout << "Same" << endl; 

	else
		cout << "Not Same" << endl; 
} 

// Driver Code 
int main() 
{ 
	string str1, str2; 

	str1 = "Geeks"; 
	str2 = "geeks"; 
	equalIgnoreCaseUtil(str1, str2); 

	str1 = "Geek"; 
	str2 = "geeksforgeeks"; 
	equalIgnoreCaseUtil(str1, str2); 
	return 0; 
} 
>>>>>>> d0371806ea9ff5d0d181dfd01f3d2cdc18ab0772
