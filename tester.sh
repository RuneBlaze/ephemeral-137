#!/bin/bash
declare -i total=0
declare -i incorrect=0

red=`tput setaf 1`
green=`tput setaf 2`
reset=`tput sgr0`

echo "${green}Testing Started: If any errors occur it would be in red${reset}"

for i in ephemeral-137/*.java; do
    [ -f "$i" ] || break
    let "total=total+1"
    echo "========$i========"
    source ephemeral-137/runner.sh "${i%.*}"
    ec=$?
    if [ "$ec" -ne 0 ]; then
        echo "${red} $i not passed: $ec ${reset}"
        let "incorrect=incorrect+1"
    fi
    # echo "================="
done


rm ephemeral-137/*.class
rm ephemeral-137/*.out
rm ephemeral-137/*.mJAM
rm ephemeral-137/*.asm