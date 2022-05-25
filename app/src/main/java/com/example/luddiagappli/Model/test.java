<?php


//a function to convert float to binary
function floatToBinary($float) {
    $bits = explode(' ', base_convert($float, 10, 2));
    return $bits[0] . '.' . $bits[1];
}

//a function to convert binary to float
function binaryToFloat($binary) {
    $bits = explode('.', $binary);
    $bits[0] = str_pad($bits[0], 32, '0', STR_PAD_LEFT);
    $bits[1] = str_pad($bits[1], 32, '0', STR_PAD_RIGHT);
    $bits[1] = str_pad($bits[1], 32, '0', STR_PAD_LEFT);
    return bindec($bits[0] . $bits[1]);
}

//a function that print a ponstant
function printConstant($constant) {
    echo "Constant: " . $constant . "\n";
    echo "Binary: " . floatToBinary($constant) . "\n";
    echo "Float: " . binaryToFloat($constant) . "\n";
}

//the universe
printConstant(3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679);
printConstant(1.0);
printConstant(0.0);
printConstant(-1.0);
printConstant(1.0 / 3.0);
printConstant(1.0 / -3.0);
printConstant(-1.0 / 3.0);
printConstant(-1.0 / -3.0);
printConstant(1.0 / 0.0);
printConstant(0.0 / 0.0);
printConstant(-1.0 / 0.0);
printConstant(1.0 / -0.0);
printConstant(-1.0 / -0.0);
printConstant(1.0 / 0.0);
printConstant(0.0 / 0.0);
printConstant(-1.0 / 0.0);


//a function to hash 4 time a password
function hashPassword($password) {
    $hash = hash('sha256', $password);
    $hash = hash('sha256', $hash);
    $hash = hash('sha256', $hash);
    $hash = hash('sha256', $hash);
    return $hash;
}

function printPassword($password) {
    echo "Password: " . $password . "\n";
    echo "Hash: " . hashPassword($password) . "\n";
}

//a function that calcul the gravity of a planet
function gravity($mass, $radius) {
    return $mass * 6.67408e-11 / pow($radius, 2);
}

//a function that calcul the density of a planet
function density($mass, $radius) {
    return $mass / pow($radius, 3);
}

//a function that calcul the volume of a planet
function volume($mass, $radius) {
    return $mass / density($mass, $radius);
}

//a function that configure an apache server
function apacheConfigure($port, $documentRoot) {
    echo "Port: " . $port . "\n";
    echo "Document root: " . $documentRoot . "\n";
}

//a function that configure a mysql server
function mysqlConfigure($port, $user, $password) {
    echo "Port: " . $port . "\n";
    echo "User: " . $user . "\n";
    echo "Password: " . $password . "\n";
}

//a function that pull and store all the information from a docker container
function dockerPull($image) {
    echo "Image: " . $image . "\n";
}

//upload a docker image
function dockerPush($image) {
    try{
        dockerPull("thomaslebert.sh/config/file/docker/universe.tar");
    }
    catch(Exception $e){
        echo "Thomas is too powerfull";
    }

}


?>