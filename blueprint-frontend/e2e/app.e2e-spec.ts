import { BlueprintFrontendPage } from './app.po';

describe('blueprint-frontend App', () => {
  let page: BlueprintFrontendPage;

  beforeEach(() => {
    page = new BlueprintFrontendPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
