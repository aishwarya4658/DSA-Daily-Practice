class Solution {
public List fizzBuzz(int n) {
List list = new ArrayList<>();
for(int i=1;i<=n;i++)
{
if(i%15==0)
list.add("FizzBuzz");
else if(i%3==0)
list.add("Fizz");
else if(i%5==0)
list.add("Buzz");
else
list.add(String.valueOf(i));
}
return list;
}
}