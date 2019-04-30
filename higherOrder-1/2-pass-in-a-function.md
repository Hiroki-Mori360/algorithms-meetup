# Pass In A Function

## Summary

Create a function `execute` which takes two arguments; a value of any kind (`param`) and another function (`func`).
`execute` should return the result of calling (`func`) with (`param`) as an argument.

## Input

Your input will be a value (`param`) and a function (`func`).

## Example 1

```
execute(5, console.log);
//should log '5' to the console
```

## Example 2

```
function positive(x) {
  if(x > 0){
    return true;
  }
  return false
}
console.log(execute(20, positive));
// should return 'true'

console.log(execute(-5, positive))
// should return 'false'
```