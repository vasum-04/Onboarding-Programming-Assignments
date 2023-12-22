function isVowelPresent(s) {
    return /[aeiou]/i.test(s);
}

const string = "BrowserStack";
console.log("Vowel present:", isVowelPresent(string));
