RESTAPI Salesforce with SSO(OAuth2)
=======================

This is a caller restapi application that connects to Salesforce via SSO (OAuth2)

Run on Heroku:

1. Deploy this app on Heroku: [![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://heroku.com/deploy)
1. Create a new Connected App on Salesforce
1. Fill in the `Connected App Name`, `API Name`, and `Contact Email` fields
1. Select `Enable OAuth Settings` and enter the following `Callback URLs`:

        https://YOUR_HEROKU_APP_NAME.herokuapp.com/login

1. Select `Full access (full)` from the list of OAuth Scopes and click `Add`
1. Click `Save` and them `Continue` to complete the creation of the new Connected App
1. Manage the settings for your Heroku app (via the [Heroku Dashboard](https://dashboard.heroku.com)) and add `SECURITY_OAUTH2_CLIENT_CLIENT_ID` and `SECURITY_OAUTH2_CLIENT_CLIENT_SECRET`config vars using the values from the newly created Connected App
1. Wait about 10 minutes until the OAuth app creation is completed
1. Check out your your new app
