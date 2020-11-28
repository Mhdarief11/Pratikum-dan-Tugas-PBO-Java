var person = {
    fullName: function(birth, city) {
        return this.firstName + " " + this.lastName + "," + birth + "," + city
    }
}

var person1 = {
    firstName: "Muhammad",
    lastName: "Arif"
}

// menggunakan apply
var result = person.fullName.apply(person1, ["Brebes", "Mei"])
console.log(result);