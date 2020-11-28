var person = {
    fullname: function() {
        return this.firstName + " " + this.lastName
    }
}

var person1 = {
    firstName: "Muhammad",
    lastName: "Arif"
}

var person2 = {
    firstName: "Buyung",
    lastName: "lapuak"
}

// memanggil method dengan method call()
var result = person.fullname.call(person2)

console.log(result);