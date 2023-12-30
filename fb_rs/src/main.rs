fn fizzbuzz() -> Vec<String> {
    let mut output: Vec<String> = Vec::new();
    for i in 1..=100 {
        let mut result: String = String::new();
        if i % 3 == 0 {
            result += "Fizz";
        }
        if i % 5 == 0 {
            result += "Buzz";
        }
        if result.is_empty() {
            result = i.to_string();
        }
        output.push(result);
    }
    return output;
}

fn print_vec(vec: Vec<String>) {
    for i in vec {
        print!("{i} ");
    }
}

fn main() {
    print_vec(fizzbuzz());
}
