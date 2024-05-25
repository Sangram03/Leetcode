class Solution {
	// varible class name
	public:
		//access modifier 
		vector<int>twoSum(vector<int>&nums, int target)
		// varible declear in integer
		{
			vector<pair<int,int>>temp;
			vector<int>ans;
			// "temp": a vector of pairs to store the elements of "nums" along with their original indices.
			// "ans" : a vector to store the result indices.
			for(int i=0;i<nums.size();I++){
				pair<int,int> pr ={nums[i],i};
				temp.push_back(pr);
			}
			// iterate through the "nums" array.
			// For each elements, Create a pair consiting of the elements and it's index.
			//add this pair to the "temp" vector.
			 sort(temp.begin(),temp.end());
			 // sort the "temp" vector based on the first element of each pair(the orinal array values).
			 // This allows the tw-pointer techjnique to work efficiently
			 int s = 0;
			int e = nums.size()-1;
			// Initialize two pointers,'s'(start)and 'e'(end) , to the beginning and end of the sorted'temp' vector,respectively.
			while(s<e)
			{
				int sum = temp[s].first+temp[e].first;
				if(sum==target)
				{
					ans.push_back(temp[s].second);
					ans.push_back(temp[e].second);
					break;
				}
				if(sum<target)
				{
					s++;
				}
				else{
					e-
				}
				// Iterate while 's' is less then 'e';
				//calculate the sum of the elements at the 's' and 'e' pointers.
				//if the sum equals to target, store the original indices of these elements in 'ans' and break out of the loop.
				// if the sum is less then target, move the 's' pointers to the right (increment)
				// if the sum is grater then the target, move the 'e' pointer to the left (decreament)
			}
			//return the value
			return ans;
		}
};
// sorting time complexity is o(nlogn)time
// two pointers take  time complexity o(n)
// space complexity O(n)



// Lets Do a Example 

// Consider 'nums=[2,7,11,15]' and 'target =9';
// inital pairs in "temp";'[(2,0),(7,1),(11,2),(15,3)]'
// Using two pointers technique;
// > first iteraion:"sum =2+15 =17" (too large, move'e' left)
// > second iteration: 'sum=2+11 = 13'(still too large,move'e'left)
// > third itration: 'sum= 2+7= 9'(match found)


// then result '[0, 1]'






















