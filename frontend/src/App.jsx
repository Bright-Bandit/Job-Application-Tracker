import { useState } from "react";

function register() {

    const [form, setForm] = useState({
        firstName: "",
        surname: "",
        email: "",
        password: ""
    });

    const handleRegister = async () => {

        const response = await fetch(
            "http://localhost:8080/api/auth/register",
            {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(form)
            }
        );

        const message = await response.text();

        alert(message);
    };

    return (
        <div>
            <h2>Create Account</h2>

            <input
                placeholder="First name"
                onChange={e => setForm({
                    ...form,
                    firstName: e.target.value
                })}
            />

            <input
                placeholder="Surname"
                onChange={e => setForm({
                    ...form,
                    surname: e.target.value
                })}
            />

            <input
                placeholder="Email"
                onChange={e => setForm({
                    ...form,
                    email: e.target.value
                })}
            />

            <input
                type="password"
                placeholder="Password"
                onChange={e => setForm({
                    ...form,
                    password: e.target.value
                })}
            />

            <button onClick={handleRegister}>
                Register
            </button>
        </div>
    );
}

export default register;